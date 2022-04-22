package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	HotelRepo repo;
	@Override
	public List<Hotel> getCust() {
		// TODO Auto-generated method stub
		List<Hotel> l=repo.findAll();
		return l;
	}
	/*@Override
	public Hotelmodel getbyid(int cid) {
		// TODO Auto-generated method stub
		Hotelmodel h=repo.getById(cid);
		return h;
	}
	@Override
	public void saveCust(Hotelmodel h) {
		// TODO Auto-generated method stub
		repo.save(h);
	}
	@Override
	public void delCust(int cid) {
		// TODO Auto-generated method stub
		repo.deleteById(cid);
	}
	@Override
	public void update(Hotelmodel h) {
		// TODO Auto-generated method stub
		repo.save(h);
	}
	*/

}
