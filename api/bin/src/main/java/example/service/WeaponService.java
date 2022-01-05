package example.service;

import example.model.Weapon;

import java.util.List;

/**
 * @author regcrix
 */
public interface WeaponService {

    List<Weapon> findAll();

    Weapon findByName(String name);

}
