package challenge;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository repository;

	@Override
	public Quote getQuote() {
		List<Quote> findAll = repository.findAll();
		return findAll.stream().findAny().get();
		
	}

	@Override
	public Quote getQuoteByActor(String actor) {
	    List<Quote> findByActor = repository.findByActor(actor);
		return findByActor.stream().findFirst().get();
	}

}
