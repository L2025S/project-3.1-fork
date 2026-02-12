package se.iths.yunus.javatools.service;

import org.springframework.stereotype.Service;
import se.iths.yunus.javatools.model.Sprit;
import se.iths.yunus.javatools.repository.SpritRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class SpritService {
    private final SpritRepository spritRepository;

    public SpritService(SpritRepository spritRepository) {
        this.spritRepository = spritRepository;
    }

    //Get all
    public List<Sprit> getAllSprit() {
        return spritRepository.findAll();
    }

    public Sprit createSprit(Sprit sprit) {
        return spritRepository.save(sprit);
    }

    //Get en
    public Sprit getSpritId(Long id) {
        return spritRepository
                .findById(id).orElseThrow(() -> new NoSuchElementException("No Sprit"));
    }

    public Sprit updateSprit(Long id, Sprit sprit) {
        sprit.setId(id);
        return spritRepository.save(sprit);
    }

    public void deleteSprit(Long id) {
        spritRepository.deleteById(id);
    }
}
