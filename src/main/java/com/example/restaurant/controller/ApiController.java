package com.example.restaurant.controller;

import com.example.restaurant.wishlist.dto.WishListDto;
import com.example.restaurant.wishlist.service.WishListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/restaurant")
@RequiredArgsConstructor
public class ApiController {

    private final WishListService wishListService;

    @GetMapping("/search")
    public WishListDto search(@RequestParam String query){
        return wishListService.search(query);

    }
}
