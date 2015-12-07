package com.u2opia.foneverify.utility;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class Preferances {

	public static String getCustomerId(Context context) {
		String customerId = "";
		SharedPreferences sharedPreferences = context.getSharedPreferences(
				Constant.CUSTOMER_ID_PREFERENCE, Context.MODE_PRIVATE);
		customerId = sharedPreferences.getString(Constant.CUSTOMER_ID, "");
		return customerId;
	}

	public static void setCustomerId(Context context, String strCustomerId) {
		if (context != null) {
			SharedPreferences sharedPreferences = context.getSharedPreferences(
					Constant.CUSTOMER_ID_PREFERENCE, Context.MODE_PRIVATE);
			Editor editor = sharedPreferences.edit();
			editor.putString(Constant.CUSTOMER_ID, strCustomerId);
			editor.commit();
		}
	}

	public static String getMsisdn(Context context) {
		String msisdn = "";
		SharedPreferences sharedPreferences = context.getSharedPreferences(
				Constant.MSISDN_PREFERENCE, Context.MODE_PRIVATE);
		msisdn = sharedPreferences.getString(Constant.MSISDN, "");
		return msisdn;
	}

	public static void setMsisdn(Context context, String strMsisdn) {
		if (context != null) {
			SharedPreferences sharedPreferences = context.getSharedPreferences(
					Constant.MSISDN_PREFERENCE, Context.MODE_PRIVATE);
			Editor editor = sharedPreferences.edit();
			editor.putString(Constant.MSISDN, strMsisdn);
			editor.commit();
		}
	}

	public static String getAppKey(Context context) {
		String appKey = "";
		SharedPreferences sharedPreferences = context.getSharedPreferences(
				Constant.APPKEY_PREFERENCE, Context.MODE_PRIVATE);
		appKey = sharedPreferences.getString(Constant.APPKEY, "");
		return appKey;
	}

	public static void setAppKey(Context context, String strAppKey) {
		if (context != null) {
			SharedPreferences sharedPreferences = context.getSharedPreferences(
					Constant.APPKEY_PREFERENCE, Context.MODE_PRIVATE);
			Editor editor = sharedPreferences.edit();
			editor.putString(Constant.APPKEY, strAppKey);
			editor.commit();
		}
	}

	public static String getCountryCode(Context context) {
		String countryCode = "";
		SharedPreferences sharedPreferences = context.getSharedPreferences(
				Constant.COUNTRY_CODE_PREFERENCE, Context.MODE_PRIVATE);
		countryCode = sharedPreferences.getString(Constant.COUNTRY_CODE, "");
		return countryCode;
	}

	public static void setCountryCode(Context context, String strCountryCode) {
		if (context != null) {
			SharedPreferences sharedPreferences = context.getSharedPreferences(
					Constant.COUNTRY_CODE_PREFERENCE, Context.MODE_PRIVATE);
			Editor editor = sharedPreferences.edit();
			editor.putString(Constant.COUNTRY_CODE, strCountryCode);
			editor.commit();
		}
	}

	public static String getVerificationCode(Context context) {
		String verificationCode = "";
		SharedPreferences sharedPreferences = context.getSharedPreferences(
				Constant.VERIFICATION_ID_PREFERENCE, Context.MODE_PRIVATE);
		verificationCode = sharedPreferences.getString(
				Constant.VERIFICATION_ID, "");
		return verificationCode;
	}

	public static void setVerificationCode(Context context,
			String strVerificationCode) {
		if (context != null) {
			SharedPreferences sharedPreferences = context.getSharedPreferences(
					Constant.VERIFICATION_ID_PREFERENCE, Context.MODE_PRIVATE);
			Editor editor = sharedPreferences.edit();
			editor.putString(Constant.VERIFICATION_ID, strVerificationCode);
			editor.commit();
		}
	}

	public static String getOtpUrl(Context context) {
		String OtpUrl = "";
		SharedPreferences sharedPreferences = context.getSharedPreferences(
				Constant.OTP_URL_PREFERANCE, Context.MODE_PRIVATE);
		OtpUrl = sharedPreferences.getString(Constant.OTP_URL, "");
		return OtpUrl;
	}

	public static void setOtpUrl(Context context, String strOtpUrl) {
		if (context != null) {
			SharedPreferences sharedPreferences = context.getSharedPreferences(
					Constant.OTP_URL_PREFERANCE, Context.MODE_PRIVATE);
			Editor editor = sharedPreferences.edit();
			editor.putString(Constant.OTP_URL, strOtpUrl);
			editor.commit();
		}
	}

	public static String getOtpVerifyUrl(Context context) {
		String otpVerifyUrl = "";
		SharedPreferences sharedPreferences = context.getSharedPreferences(
				Constant.OTPVERIFY_URL_PREFERANCE, Context.MODE_PRIVATE);
		otpVerifyUrl = sharedPreferences.getString(Constant.OTPVERIFY_URL, "");
		return otpVerifyUrl;
	}

	public static void setOtpVerifyUrl(Context context, String strotpVerifyUrl) {
		if (context != null) {
			SharedPreferences sharedPreferences = context.getSharedPreferences(
					Constant.OTPVERIFY_URL_PREFERANCE, Context.MODE_PRIVATE);
			Editor editor = sharedPreferences.edit();
			editor.putString(Constant.OTPVERIFY_URL, strotpVerifyUrl);
			editor.commit();
		}
	}
	
	public static String getDidNumber(Context context) {
		String didNumber = "";
		SharedPreferences sharedPreferences = context.getSharedPreferences(Constant.DID_NUMBER_PREFERANCE, Context.MODE_PRIVATE);
		didNumber = sharedPreferences.getString(Constant.DID_NUMBER, "");
		return didNumber;
	}

	public static void setDidNumber(Context context, String strDidNumber) {
		if (context != null) {
			SharedPreferences sharedPreferences = context.getSharedPreferences(Constant.DID_NUMBER_PREFERANCE, Context.MODE_PRIVATE);
			Editor editor = sharedPreferences.edit();
			editor.putString(Constant.DID_NUMBER, strDidNumber);
			editor.commit();
		}
	}

}
