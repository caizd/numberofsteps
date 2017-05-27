package cn.caizhongdong.numberofsteps.dao;

import cn.caizhongdong.numberofsteps.domain.VendorGift;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VendorGiftDao {

	public List<VendorGift> getGiftsByCategory(@Param(value = "vendorId") int vendorId, @Param(value = "categoryId") int categoryId);
	
	public List<VendorGift> getAllGifts(int vendorId);
	
	public VendorGift getVendorGift(@Param(value = "vendorId") int vendorId, @Param(value = "giftId") String giftId);
}
