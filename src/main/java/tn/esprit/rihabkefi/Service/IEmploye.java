package tn.esprit.rihabkefi.Service;

import tn.esprit.rihabkefi.Entity.Company;
import tn.esprit.rihabkefi.Entity.Employe;

public interface IEmploye {
    public Employe addEmploye(Employe emp);
    public Employe assignEmployeTOCompany(Employe employe, Long CompanyId);

}
