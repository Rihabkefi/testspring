package tn.esprit.rihabkefi.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.rihabkefi.Entity.Employe;
import tn.esprit.rihabkefi.Service.IEmploye;
@RestController


public class EmployeController {
    private IEmploye iEmploye ;
    @PostMapping("/addEmployeAndAssignToCompany")
    public Employe addEmployeAndAssignToCompany(@RequestBody Employe employe, @RequestParam long CompanyId) {
        return iEmploye.assignEmployeTOCompany(employe, CompanyId);
    }
}
