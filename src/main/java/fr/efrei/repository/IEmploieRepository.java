package fr.efrei.repository;

import fr.efrei.domain.Demographic_info;
import fr.efrei.domain.Emploie;

import java.util.List;

public interface IEmploieRepository extends IRepository<Emploie, String>{
    public List<Emploie> getAll();
    public Emploie getIndex(int i);
}
