package tahiti.numerique.time_zone.metier.timezone.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import tahiti.numerique.time_zone.core.exception.NotFoundException;
import tahiti.numerique.time_zone.metier.timezone.controller.TimezoneRequest;
import tahiti.numerique.time_zone.metier.timezone.mapper.TimezoneMapper;
import tahiti.numerique.time_zone.persistence.timezone.Timezone;
import tahiti.numerique.time_zone.persistence.timezone.TimezoneRepository;

@Service
@RequiredArgsConstructor
public class TimezoneService {

    private final TimezoneRepository timezoneRepository;
    private final TimezoneMapper timezoneMapper;

    /*public Page<Timezone> findAll() {
        return timezoneRepository.findAll();
    } */

    public Timezone findById(Long id) {
        return timezoneRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("timezone.notFound", new Object[]{id}));
    }

    public Timezone create(TimezoneRequest form) {
        return save(new Timezone(), form);
    }

    public Timezone update(Long id, TimezoneRequest form) {
        var timezone = findById(id);
        return save(timezone, form);
    }

    private Timezone save(Timezone timezone, TimezoneRequest form) {
        timezoneMapper.populate(timezone, form);
        return timezoneRepository.save(timezone);
    }

    public void deleteById(Long id) {
        var timezone = findById(id);
        timezoneRepository.delete(timezone);
    }

}
