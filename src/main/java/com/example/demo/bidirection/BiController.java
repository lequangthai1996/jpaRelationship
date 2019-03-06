package com.example.demo.bidirection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BiController {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private ReportRepository reportRepository;

    @GetMapping("/author")
    public Author saveAuthor(@RequestParam("name") String name) {
        Author author = new Author();
        author.setName(name);
        authorRepository.save(author);
        return author;
    }

    @GetMapping("/report")
    public Report saveReport(@RequestParam("name") String name, @RequestParam("content") String content) {
        Report report = new Report();
        report.setName(name);
        report.setContent(content);
        reportRepository.save(report);
        return report;
    }

    @GetMapping("/setReport")
    public Author setReportForAuthor(@RequestParam("id_author") String idAuthor,
                                     @RequestParam("id_report") String idReport) {
        Author author = authorRepository.findById(Long.parseLong(idAuthor)).get();
        Report report = reportRepository.findById(Long.parseLong(idReport)).get();
        List<Report> listRP = author.getListReports();
        listRP.add(report);
        authorRepository.save(author);
        return author;
    }

    @GetMapping("/setAuthor")
    public ReportResponse setAuthorForReport(
            @RequestParam("id_author") String idAuthor,
            @RequestParam("id_report")  String idReport){
        Author author = authorRepository.findById(Long.parseLong(idAuthor)).get();
        Report report = reportRepository.findById(Long.parseLong(idReport)).get();
        report.setAuthor(author);
        reportRepository.save(report);
        ReportResponse reportResponse = new ReportResponse();
        reportResponse.setId(report.getId());
        reportResponse.setName(report.getName());
        reportResponse.setContent(report.getContent());
        return reportResponse;
    }
}
