package fr.efrei.repository;

import fr.efrei.domain.Identity_Type;

import java.util.List;

public interface IIdentity_TypeRepository extends IRepository<Identity_Type, String>{
    public List<Identity_Type> getAll();
    public Identity_Type getIndex(int i);
}
