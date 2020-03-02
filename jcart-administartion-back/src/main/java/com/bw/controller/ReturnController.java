package com.bw.controller;


import com.bw.dto.in.ReturnSearchInDTO;
import com.bw.dto.in.ReturnUpdateActionInDTO;
import com.bw.dto.out.PageOutDTO;
import com.bw.dto.out.ReturnListOutDTO;
import com.bw.dto.out.ReturnShowOutDTO;
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
