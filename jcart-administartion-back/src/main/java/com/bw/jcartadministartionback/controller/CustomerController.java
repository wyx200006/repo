package com.bw.jcartadministartionback.controller;


import com.bw.jcartadministartionback.dto.in.CustomerSearchInDTO;
import com.bw.jcartadministartionback.dto.out.CustomerListOutDTO;
import com.bw.jcartadministartionback.dto.out.CustomerShowOutDTO;
import com.bw.jcartadministartionback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        return null;
    }

    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId){

    }

}
