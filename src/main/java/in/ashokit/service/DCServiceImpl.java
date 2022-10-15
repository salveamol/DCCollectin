package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import in.ashokit.entity.DCEntity;
import in.ashokit.repo.DcRepo;


public class DCServiceImpl implements DCService{

	@Autowired
	private DcRepo dcRepo;
	
	@Autowired
	private DCEntity dcEntity;
	
	@Override
	public void createCase(Integer app_Id) {
		
		Integer id = dcEntity.getApp_ID();
		if(app_Id == id) {
			Integer case_Number = 12345;
			dcEntity.setCase_Number(case_Number);
			dcRepo.save(dcEntity);
		}
	}

		@Override
	public List<DCEntity> getAvailablePlans() {
			List<DCEntity> findAll = dcRepo.findAll();
		return findAll;
	}

	@Override
	public DCEntity getIncomeDetails(DCEntity dCEntity) {
		dCEntity.setMonthly_Income(monthly_Income);
		return null;
	}

	@Override
	public DCEntity getKidsDetails(DCEntity dCEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
