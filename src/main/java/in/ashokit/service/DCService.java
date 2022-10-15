package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.entity.DCEntity;

@Service
public interface DCService {

	public void createCase(Integer app_Id);
	
	public List<DCEntity> getAvailablePlans();
	
	public DCEntity getIncomeDetails(DCEntity dCEntity);
	
	public DCEntity getKidsDetails(DCEntity dCEntity);
	
	
	
}
