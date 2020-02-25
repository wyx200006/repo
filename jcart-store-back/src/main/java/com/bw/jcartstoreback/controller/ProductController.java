package com.bw.jcartstoreback.controller;


import com.bw.jcartstoreback.dto.in.ProductSearchInDTO;
import com.bw.jcartstoreback.dto.out.PageOutDTO;
import com.bw.jcartstoreback.dto.out.ProductListOutDTO;
import com.bw.jcartstoreback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

}
