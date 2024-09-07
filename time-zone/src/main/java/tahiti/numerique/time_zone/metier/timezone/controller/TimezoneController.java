package tahiti.numerique.time_zone.metier.timezone.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tahiti.numerique.time_zone.metier.timezone.mapper.CalculateDateMapper;
import tahiti.numerique.time_zone.metier.timezone.mapper.TimezoneMapper;
import tahiti.numerique.time_zone.metier.timezone.service.TimezoneService;

@RestController
@RequestMapping("/timezones")
@RequiredArgsConstructor
public class TimezoneController {

    private final TimezoneService service;
    private final TimezoneMapper mapper;
    private final CalculateDateMapper calculateDateMapper;

    @GetMapping
    public ResponseEntity<Page<TimezoneResponse>> getAllTimezones(
            @PageableDefault Pageable pageable
    ) {
        return ResponseEntity.ok(service.findAll(pageable).map(mapper::mapToResponse));
    }

    @PostMapping
    public ResponseEntity<TimezoneResponse> createTimezone(@RequestBody TimezoneRequest form) {
        return ResponseEntity.ok(mapper.mapToResponse(service.create(form)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TimezoneResponse> getTimezoneById(@PathVariable Long id) {
        return ResponseEntity.ok(mapper.mapToResponse(service.findById(id)));
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

    @PostMapping("/calculate-date")
    public ResponseEntity<CalculateDateResponse> calculateDate(@RequestBody CalculateDateRequest form) {
        return  ResponseEntity.ok(this.calculateDateMapper.mapToResponse(this.service.calculateDate(form)));
    }

}
