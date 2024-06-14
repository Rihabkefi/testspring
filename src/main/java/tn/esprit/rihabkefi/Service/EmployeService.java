package tn.esprit.rihabkefi.Service;

import tn.esprit.rihabkefi.Entity.Company;
import tn.esprit.rihabkefi.Entity.Employe;
import tn.esprit.rihabkefi.Repository.EmployRepo;
import tn.esprit.rihabkefi.Repository.companyrepository;

import java.util.Optional;

public class EmployeService implements IEmploye {
    private EmployRepo employerepository;
    private companyrepository Companyrep;

    @Override
    public Employe addEmploye(Employe emp) {
        return employerepository.save(emp);
    }

    @Override
    public Employe assignEmployeTOCompany(Employe employe, Long CompanyId) {
        Employe emp = employerepository.findByFirstName(employe.getFirstName());

        if (emp == null) {
            throw new IllegalArgumentException("Employé non trouvé avec le prénom: " + employe.getFirstName());
        }

        Optional<Company> companyOptional = Companyrep.findById(CompanyId);


        Company company = companyOptional.get();

        emp.setCompany(company);

        return employerepository.save(emp);
    }}




