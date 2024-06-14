package tn.esprit.rihabkefi.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.rihabkefi.Entity.Company;
import tn.esprit.rihabkefi.Service.iCompany;


@RestController
public class CompanyController {
private iCompany icompanyy ;
    @PostMapping("/addAb")
    public Company addcompany(@RequestBody Company com){
        return icompanyy.addcompany(com);
    }

}
