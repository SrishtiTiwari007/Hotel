package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface HotelService {
List<Hotel> getCust();
/*Hotelmodel getbyid(int cid);
void saveCust(Hotelmodel h);
void delCust(int cid);
void update(Hotelmodel h);*/
}
