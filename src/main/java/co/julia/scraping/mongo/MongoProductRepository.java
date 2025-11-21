package co.julia.scraping.mongo;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

@Profile("mongo")
public interface MongoProductRepository extends MongoRepository<ProductDocument, String> {
    Optional<ProductDocument> findByUrl(String url);
}