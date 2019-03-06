package com.example.demo.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ManyToOneController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private NetworkRepository networkRepository;
    @Autowired
    private UserNetworkRepository userNetworkRepository;
    @GetMapping("/user")
    public String saveUser(@RequestParam("loginId") String loginId,
                               @RequestParam("password") String password
                               ) {
        UserEntity u = new UserEntity();
        u.setLoginId(loginId);
        u.setPassword(password);
        userRepository.save(u);
        return "Add user sucess";
    }

    @GetMapping("/net")
    public String saveNetwork(@RequestParam("code") String code, @RequestParam("name") String name, @RequestParam("user_id") String userId) {
        NetworkEntity n = new NetworkEntity();
        UserEntity u = userRepository.findById(Long.parseLong(userId)).get();
        n.setUser(u);
        n.setNetworkCode(code);
        n.setNetworkName(name);
        networkRepository.save(n);
        return "Add network Success";
    }

    @GetMapping("usernet")
    public String addUserNetwork(@RequestParam("id_user") String idUser, @RequestParam("id_network") String idNetwork) {
        UserNetworkEntity un = new UserNetworkEntity();
        UserEntity u = userRepository.findById(Long.parseLong(idUser)).get();
        NetworkEntity n = networkRepository.findById(Long.parseLong(idNetwork)).get();

        un.setUser(u);
        un.setNetwork(n);
        userNetworkRepository.save(un);
        return "add constain user-network successs";
    }

    @GetMapping("getNetworkOfUser")
    public List<NetworkResponse> getNetworkOfuser(@RequestParam("id_network") String idUser) {
        UserEntity u = userRepository.findById(Long.parseLong(idUser)).get();
        List<NetworkResponse> listNetwork = new ArrayList<>();

        List<UserNetworkEntity> listUserNetwork = u.getUserNetworks();
        for(UserNetworkEntity un: listUserNetwork) {
            NetworkEntity n = un.getNetwork();
            NetworkResponse rs = new NetworkResponse();
            rs.setId(n.getId());
            rs.setCode(n.getNetworkCode());
            rs.setName(n.getNetworkName());
            listNetwork.add(rs);
        }
        return listNetwork;
    }
}
