package com.dq.filter;

import com.dq.version.VersonManager;

public class test {

	public static boolean checkFormat(String[] nums) {
		boolean isNum = true;
		try {
			if (nums.length == 3) {
				for (int i = 0; i < nums.length; i++) {
					Integer.parseInt(nums[i]);
					if (i == 2) {
						if (nums[i].length() > 4)
							isNum = false;
					} else {
						if (nums[i].length() > 2)
							isNum = false;
					}
				}

			} else if (nums.length == 4) {
				for (int i = 0; i < nums.length - 1; i++) {
					Integer.parseInt(nums[i]);
					if (i == 2) {
						if (nums[i].length() > 4)
							isNum = false;
					} else {
						if (nums[i].length() > 2)
							isNum = false;
					}
				}
				String strNew = nums[3].replaceAll("[^0-9]", "");
				if (strNew.length() > 4)
					isNum = false;
			}
		} catch (Exception e) {
			isNum = false;
		}
		return isNum;
	}
}
