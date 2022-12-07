package fr.efrei.repository;

import fr.efrei.domain.Emploie;
import fr.efrei.domain.Poste;

import java.util.List;

public interface IPosteRepository extends IRepository<Poste, String>{
    public List<Poste> getAll();
    public Poste getIndex(int i);
}
