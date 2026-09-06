package com.movieflix.movieflix.service;


import com.movieflix.movieflix.entity.Streaming;
import com.movieflix.movieflix.repository.StreamingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class StreamingService {

   private final StreamingRepository repository;

   @GetMapping()
   public List<Streaming> findAll() {
      return repository.findAll();
   }


   public Streaming save(Streaming streaming) {
      return repository.save(streaming);
   }

   public Optional<Streaming> findbyId(Long id) {
      return repository.findById(id);
   }

   public void delete(Long id)
   {
      repository.deleteById(id);
   }



}
