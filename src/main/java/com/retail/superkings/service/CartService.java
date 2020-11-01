package com.retail.superkings.service;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.retail.superkings.entity.Cart;
import com.retail.superkings.repo.CartRepo;

@Service
public class CartService {

	@Autowired
	private CartRepo cartRepo;

	@Transactional
	public Object saveProduct(Cart products) {
		if (cartRepo.existsById(products.getUserId())) {
			Cart cartDetails = cartRepo.findByuserId(products.getUserId());
			cartDetails.setProducts(products.getProducts());
			String usr = cartRepo.save(cartDetails).getUserId();
			return getCartById(usr);
		} else {
			String usr = cartRepo.save(products).getUserId();
			return getCartById(usr);
		}

	}

	public Object getCartById(String usr) {
		if (cartRepo.existsById(usr)) {
			Cart cartDetails = cartRepo.findByuserId(usr);
			double val = 0;
			for (int i = 0; i < cartDetails.getProducts().size(); i++) {
				Map<String, String> mp = cartDetails.getProducts().get(i);
				val = val + Integer.parseInt(mp.get("price")) * Integer.parseInt(mp.get("quantity"));
			}
			cartDetails.setTotalValue(val);
			return cartDetails;
		} else
			return "User Dont have any cart details";

	}

}
