package tn.esprit.rihabkefi.Service;

import tn.esprit.rihabkefi.Entity.Company;
import tn.esprit.rihabkefi.Repository.companyrepository;

public class CompanyService implements iCompany{
    private companyrepository Companyrepo;
    @Override
    public Company addcompany( Company com) {
        if (com.getCompanyName() == null) {
            throw new IllegalArgumentException("Company name must not be null");
        }
        return Companyrepo.save(com);

    }
    }

