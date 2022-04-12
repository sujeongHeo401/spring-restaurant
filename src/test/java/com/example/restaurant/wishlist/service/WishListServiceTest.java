package com.example.restaurant.wishlist.service;

import com.example.restaurant.naver.dto.SearchImageReq;
import com.example.restaurant.naver.dto.SearchLocalReq;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WishListServiceTest {

    @Autowired
    private WishListService wishListService;

    @Test
    public void searchTest(){
        
        var search = new SearchLocalReq();
        search.setQuery("갈비집");
        var result = wishListService.search("갈비집");
        System.out.println(result);

        Assertions.assertNotNull(result);
    }
}
