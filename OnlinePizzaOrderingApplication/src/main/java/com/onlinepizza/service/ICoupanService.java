package com.onlinepizza.service;

import java.util.List;

import com.onlinepizza.model.Coupan;



public interface ICoupanService {

	Coupan addCoupans(Coupan coupan);
 
	Coupan editCoupans(Coupan coupan);

	Coupan deleteCoupans(int coupanId);
	
    List<Coupan> viewCoupans();
   
}