package tahiti.numerique.time_zone.metier.timezone.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tahiti.numerique.time_zone.metier.timezone.mapper.TimezoneMapper;
import tahiti.numerique.time_zone.metier.timezone.service.TimezoneService;

@RestController
@RequestMapping("/timezones")
@RequiredArgsConstructor
public class TimezoneController {

    private final TimezoneService service;
    private final TimezoneMapper mapper;

    /* @GetMapping
    public List<Timezone> getAllTimezones() {
        return timezoneService.findAll();
    } */

    @GetMapping("/{id}")
    public ResponseEntity<TimezoneResponse> getTimezoneById(@PathVariable Long id) {
        return ResponseEntity.ok(mapper.mapToResponse(service.findById(id)));
    }

    @PostMapping
    public ResponseEntity<TimezoneResponse> createTimezone(@RequestBody TimezoneRequest form) {
        return ResponseEntity.ok(mapper.mapToResponse(service.create(form)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TimezoneResponse> updateTimezone(@PathVariable Long id, @RequestBody TimezoneRequest form) {
        return ResponseEntity.ok(mapper.mapToResponse(service.update(id, form)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTimezone(@PathVariable Long id) {
        this.service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
