package com.bw.jcartadministartionback.service;



import com.bw.jcartadministartionback.dto.in.ProductCreateInDTO;
import com.bw.jcartadministartionback.dto.in.ProductUpdateInDTO;
import com.bw.jcartadministartionback.dto.out.ProductListOutDTO;
import com.bw.jcartadministartionback.dto.out.ProductShowOutDTO;
import com.github.pagehelper.Page;

import java.util.List;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getById(Integer productId);

}
