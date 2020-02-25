package com.bw.jcartadministartionback.controller;


import com.bw.jcartadministartionback.dto.in.ReturnSearchInDTO;
import com.bw.jcartadministartionback.dto.in.ReturnUpdateActionInDTO;
import com.bw.jcartadministartionback.dto.out.PageOutDTO;
import com.bw.jcartadministartionback.dto.out.ReturnListOutDTO;
import com.bw.jcartadministartionback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }

}
