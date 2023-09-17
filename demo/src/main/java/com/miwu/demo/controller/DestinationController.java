package com.miwu.demo.controller;

// RequiredArgsConstructor
import lombok.RequiredArgsConstructor;
// RestController
import org.springframework.web.bind.annotation.RestController;
// GetMapping
import org.springframework.web.bind.annotation.GetMapping;
// List
import java.util.List;
// Destination Entity
import com.miwu.demo.entity.Destination;
// Destination Repository
import com.miwu.demo.repository.DestinationRepository;

@RequiredArgsConstructor // 초기화 되지않은 final 변수에 대해 생성자를 생성
@RestController
public class DestinationController {
    final DestinationRepository destinationRepository;

    @GetMapping("/destination")
    public List<Destination> listDestination() {
        destinationRepository.deleteAllInBatch();
        Destination dest1 = new Destination("망상해수욕장", "NULL", "NULL");
        Destination dest2 = new Destination("망상해수욕장", "NULL", "NULL");
        destinationRepository.save(dest1);
        destinationRepository.save(dest2);
        return destinationRepository.findAll();
    }
}
