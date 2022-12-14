package fr.efrei.notuse;

import fr.efrei.domain.Demographic_info;
import fr.efrei.repository.IRepository;

import java.util.List;

public interface IDemographic_infoRepository extends IRepository<Demographic_info, String> {
    public List<Demographic_info> getAll();
    public Demographic_info getIndex(int i);
}
