package util;

public enum ResponseCode {

	 UnAuthorised(Constants.UNAUTHORIZED_ID, Constants.UNAUTHORIZED), Success(
			    Constants.SUCCESS_ID, Constants.SUCCESS), PhoneExist(
			    Constants.PHONE_EXISTS_ID, Constants.PHONE_EXIST), EmailExist(
			    Constants.EMAIL_EXISTS_ID, Constants.EMAIL_EXIST), InternalError(
			    Constants.INTERNAL_ERROR_ID, Constants.PROCESS_FAIL), InvalidSession(
			    Constants.INVALID_SESSION_ID, Constants.INVALID_SESSION), InCorrectData(
			    Constants.DATA_ERROR_ID, Constants.DATA_ERROR), FAILURE(
			    Constants.FAILURE_ID, Constants.PROCESS_FAIL), INVALIDPHONENUMBER(
			    Constants.INVALIDPHONENUMBER_ID, Constants.INVALID_PHONE_NUMBER), INVALIDPHONENUMBERLENGTH(
			    Constants.INVALIDPHONENUMBERLENGTH_ID,
			    Constants.INVALID_PHONE_NUMBER_LENGTH), BADREQUEST(
			    Constants.BAD_REQUEST_ID, Constants.BAD_REQUEST), ProfileUpdate(
			    Constants.PROFILE_UPDATE_SUCCESS_MESSAGE_ID,
			    Constants.PROFILE_UPDATE_SUCCESS_MESSAGE), changePassword(
			    Constants.CHANGE_PASSWORD_ID, Constants.CHANGE_PASSWORD_SUCCESS), CardInfoMessing(
			    Constants.CARD_INFO_MISSING, "Please verify card number."), CVNInfoMessing(
			    Constants.CVN_INFO_MISSING, "Please verify CVN number."), ExpiryDateInfoMessing(
			    Constants.EXPIRY_DATE_INFO_MISSING, "Please verify Expiry Date."), AddressInfoMessing(
			    Constants.ADDRESS_INFO_MISSING, "Please verify Address."), StateInfoMessing(
			    Constants.STATE_INFO_MISSING, "Please verify State name."), CityInfoMessing(
			    Constants.CITY_INFO_MISSING, "Please verify City name."), ZipCodeInfoMessing(
			    Constants.ZIP_CODE_INFO_MISSING, "Please verify Zip code."), CVVNUMBERINVALID(
			    Constants.INVALID_CVV_NUMBER, Constants.INVALID_CVV_NUMBER_MSG), EXPIRYMONTHINVALID(
			    Constants.INVALID_EXPIRY_MONTH, Constants.INVALID_EXPIRY_MONTH_MSG), EXPIRYYEARINVALID(
			    Constants.INVALID_EXPIRY_YEAR, Constants.INVALID_EXPIRY_YEAR_MSG), CARDTYPEINVALID(
			    Constants.INVALID_CARD_TYPE, Constants.INVALID_CARD_TYPE_MSG), INVALIDPAYMENTDETAILS(
			    Constants.INVALID_PAYMENT_DETAILS,
			    Constants.INVALID_PAYMENT_DETAILS_MSG),
			    INVALIDEMAILFORMAT(Constants.INVALID_EMAIL_FORMAT,Constants.INVALID_EMAIL_FORMAT_MESSAGE),
			    InvalidUrlResponse(Constants.INVALID_URL,Constants.INVALID_URL_MESSAGE);
		    /**
		     * error code contains int value
		     */
		    private int errorCode;
		    /**
		     * errorMessage contains proper error message.
		     */
		    private String errorMessage;

		    /**
		     * @param errorCode
		     * @param errorMessage
		     */
		    private ResponseCode(int errorCode, String errorMessage) {
			this.errorCode = errorCode;
			this.errorMessage = errorMessage;
		    }

		    /**
		     * 
		     * @param errorCode
		     * @return
		     */
		    public String getMessage(int errorCode) {
			return "";
		    }

		    /**
		     * @return
		     */
		    public int getErrorCode() {
			return errorCode;
		    }

		    /**
		     * @param errorCode
		     */
		    public void setErrorCode(int errorCode) {
			this.errorCode = errorCode;
		    }

		    /**
		     * @return
		     */
		    public String getErrorMessage() {
			return errorMessage;
		    }

		    /**
		     * @param errorMessage
		     */
		    public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		    }

		    /**
		     * This method will provide status message based on code
		     * 
		     * @param code
		     * @return String
		     */
		    public static String getResponseMessage(int code) {
			String value = "";
			ResponseCode responseCodes[] = ResponseCode.values();
			for (ResponseCode actionState : responseCodes) {
			    if (actionState.getErrorCode() == code) {
				value = actionState.getErrorMessage();
			    }
			}
			return value;
		    }
		}


