package com.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Entity.Railway;
import com.app.Repository.RailwayRepo;



@Service
@Transactional
public class RailwayService implements IRailwayService{
	@Autowired
	private RailwayRepo _railwayrepo;
	
	
	@Override
	public Railway adddeatils(Railway railway) {
		Railway saveresult=_railwayrepo.save(railway);
		return saveresult;
	}
	
	@Override
	public boolean delete(Long id) {
		_railwayrepo.deleteById(id);
		return true;
				
	}

	@Override
	public List<Railway> showDetails() {
		
		return _railwayrepo.findAll();
	}
	
	@Override
	 public Railway update(Railway railway) {
		Optional<Railway> rail= _railwayrepo.findById(railway.getId());
		System.out.println("==========================");
		System.out.println("rail "+rail);
		System.out.println("==========================");
		if(rail.isPresent()) {
			System.out.println("rail is present");
			
			Railway i=rail.get();
			i.setName(railway.getName());
			i.setCat(railway.getCat());
			i.setStarttime(railway.getStarttime());
			i.setEndtime(railway.getEndtime());
			i.setSource(railway.getSource());
			i.setDestination(railway.getDestination());
			i.setStation_code(railway.getStation_code());
			i.setDistance(railway.getDistance());
			i.setFrequency(railway.getFrequency());
		
			System.out.println(i.getEndtime());
			return _railwayrepo.save(i);
		}
		return railway;	 
	 }
	 public List<Railway> sorting(){
		return _railwayrepo.findAll(Sort.by(Sort.Direction.ASC,"rname"));
		 
	 }
}
