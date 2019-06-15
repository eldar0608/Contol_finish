package kg.dnr.currencydatabaseserver.controller;



import kg.dnr.currencydatabaseserver.entity.Rate;
import kg.dnr.currencydatabaseserver.repo.RateRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebController {

    private RateRepository rateRepository;


    @PostMapping("/rates")
    public void ratesPost(@RequestBody Rate rate){
        rateRepository.save(rate);
    }

    @GetMapping("/rates")
    public List<Rate> getFindValut(){
        return rateRepository.findAll();
    }

    @GetMapping("/rates/{date}")
    public List<Rate> getDateValut(@PathVariable String date){
        return rateRepository.findByCreatedDate(date);
    }


    @DeleteMapping("/rates")
    public void deleteValut(){
        rateRepository.deleteAll();
    }

    @DeleteMapping("/rates/{date}")
    public void deleteDateValut(@PathVariable String date){
        rateRepository.deleteByCreatedDate(date);
    }

    @PostMapping("/rates/{date}")
    public void updateDate(@PathVariable String date, Rate rate){
        List<Rate> c = rateRepository.findByCreatedDate(date);
        rate.setCode("code");
        rateRepository.save(c.get(0));
    }




}
