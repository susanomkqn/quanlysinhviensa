package vn.nmcnpm.quanlysinhvien.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import vn.nmcnpm.quanlysinhvien.domain.Classe;
import vn.nmcnpm.quanlysinhvien.repository.ClasseRepository;

@Service
public class ClasseService {

    private final ClasseRepository classeRepository;

    public ClasseService(ClasseRepository classeRepository) {
        this.classeRepository = classeRepository;
    }

    public List<Classe> getAllClasses() {
        return this.classeRepository.findAll();
    }

    public Optional<Classe> getClasseById(long id) {
        return this.classeRepository.findById(id);
    }

    public void handleSaveClass(Classe classe) {
        this.classeRepository.save(classe);
    }

    public void deleteClassById(long id) {
        this.classeRepository.deleteById(id);
    }

}
