package com.employes.profils.service;

import com.employes.profils.entities.Profil;

import java.util.List;

public interface ServiceProfil {

    Profil saveProfil(Profil p);
    Profil updateProfil(Profil p);
    void deleteProfil(Profil p);
    void deleteProfilById(String id);
    Profil getProfil(String id);
    List<Profil> getAllProfils();
}
