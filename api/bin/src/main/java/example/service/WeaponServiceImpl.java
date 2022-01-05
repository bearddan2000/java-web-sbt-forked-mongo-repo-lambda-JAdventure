package example.service;

import example.model.Weapon;
import example.repository.WeaponRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ragcrix
 */
@Service
public class WeaponServiceImpl implements WeaponService {

    @Autowired
    private WeaponRepository weaponRepository;

    @Override
    public List<Weapon> findAll() {
        return weaponRepository.findAll();
    }

    @Override
    public Weapon findByName(String name) {
      Weapon w = this.findAll()
      .stream()
      .peek(x -> System.out.println("x: " + x.getName()))
      .filter(x -> x.getName().equals(name))
      .collect(Collectors.toList())
      .get(0);

      return w;
    }
}
