package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


	public class Constants {
		 public static final String USERGROUPTYPE = "usergroup";
		 public static final String PROJECTGROUPTYPE = "projectgroup";
		 public static final String ACCOUNT = "account";
		 public static final String BUSSUNIT = "bussUnit";
		 public static final String DESIG = "desig";
		 public static final String TEAM = "team";
		 public static final String TEMPLATE = "template";
		 public static final String USERS = "user";
		 public static final String PROJECT = "projects";
	    public static final String SALT = "provide your salt to store password";
	    public static final String BANK_SALT = "save account with some other salt";
	    public static final String SUCCESS_MESSAGE = "success";
	    public static final String FAILURE_MSG = "failure";
	    public static final String TRUE = "true";
	    public static final String FAILURE_MESSAGE = "failure";
	    public static final String PHONE_EXIST = "Phone number is already registered with another account";
	    public static final String EMAIL_EXIST = "email already exist";
	    public static final String PROMO_CODE_INVALID = "Invalid promo code";
	    public static final String AUTH_NET_FAILURE = "Payment account failure";
	    public static final String CUSTOMER_TYPE_PASS = "passenger";
	    public static final String CUSTOMER_TYPE_DRIVER = "driver";
	    public static final String PAYMENT_AND_PROMO_FAILURE = "Promo code and payment type are incorrect";
	    public static final String PROCESS_FAIL = "Process failed, Please try again.";
	    public static final String MAIlSUBJECT = "welcome to";
	    public static final String MAIlSUBJECTFORDISPATCHE = "welcome to web dispatcher";
	    public static final String FORGOT_PASSWORD_SUCCESS = "Please check your email for password.";
	    public static final String INVALID_SESSION = "Invalid session";
	    public static final String USER_DAO = "user";
	    public static final String RESERVATION_DAO = "";
	    public static final String SETTING_DAO = "setting";
	    public static final String TRIP_DAO = "tripdao";
	    public static final String GOOGLE_API_Key = "";
	    public static final String FEEDBACK_MAIL = "apps@tarento.com";
	    public static final String FEEDBACK_SUBJECT = "You've received a feedback on App!";
	    // in km
	    public static final String OP_TYPE_REMOVE = "remove";
	    public static final String OP_TYPE_OFF = "off";
	    public static final String OP_TYPE_UPDATE = "update";
	    public static final String OP_TYPE_ON = "on";
	    public static final String OP_TYPE_ADD = "add";
	    public static final int DEFAULT_NOTIFICATION_COUNT = 0;
	    public static final String RESERVATION_SOURCE = "app";
	    public static final String IPHONE_DEVICE_NAME = "put your certificate password";
	    public static final String IPHONE_ACTIONLOCKEY = "Open App";
	    public static final String IPHONE_RINGER_SOUND = "longSound.mp3";
	    public static final String IPHONE_SOUND = "longSound.mp3";
	    // public static final String IPHONE_SOUND = "short.wav";
	    public static final String IPHONE_REQUEST_URI = "gateway.push.apple.com";
	    // if value is true then it will point to production and false will point to
	    // sandbox.
	    public static final boolean IPHONE_PRODUCTION_PUSH = true;
	    // public static final String IPHONE_REQUEST_URI =
	    // "gateway.sandbox.push.apple.com";
	    public static final String IPHONE_PORT = "2195";
	    public static final String IPHONE_KEY_PASS = "";

	    public static final String UPDATE_CLIENT_AUTH = "Update-Client-Auth";

	    public static final String PARAM_REGISTRATION_ID = "registration_id";

	    public static final String PARAM_DELAY_WHILE_IDLE = "delay_while_idle";

	    public static final String PARAM_COLLAPSE_KEY = "collapse_key";

	    public static final String UTF8 = "UTF-8";
	    public static final String ANDORIED_APP_ID = "AIzaSyARBYb_ZdtVAgqdTu4meNAzY2KW9khtN4g";
	    public static final String IPHONE_DRIVER_PUSH = "driver_push_production.p12";
	    public static final String FAVOURITE_OP_ADD = "add";
	    public static final String FAVOURITE_OP_REMOVE = "remove";
	    public static final String FAVOURITE_OP_GET = "get";
	    public static final String FAVOURITE_OP_UPDATE = "update";
	    public static final String IPHONE_PUSH_FILE_PATH = "";
	    public static final int AUTH_TYPE = 1;
	    public static final String PAYMENT_FAILURE = "Payment process failed. We were not able to complete the payment process. Pay directly to the driver.";
	    public static final String PAYMENT_SUCCESS_MSG = "Payment completed successfully.";
	    public static final String PAYMENT_SUCCESS_MSG_DRIV = "The amount is credited to your account. Check your email for the payment confirmation.";
	    public static final String PAYMENT_SUCCESS_MSG_PASS = "Payment completed successfully. Check your email for the trip receipt.";
	    public static final String PAYMENT_REQUIRED_MESSAGE = "Payment is needed for your plan.";
	    public static final String PLAN_CHANGED_MESSAGE = "Thanks for chaning plan, your plan will be active once admin approved it.";
	    public static final String PLAN_CHANGED_FAILURE_MESSAGE = "Plan update process failed, please try after some time.";
	    public static final String COUNTRY_CODE = "+1";
	    public static final String LOCAL_COUNTRY_CODE = "+91";
	    public static final String ADMIN_EMAIL = "";

	    /*
	     * The Constant ACCOUNT_SID. Find it at twilio.com/user/account
	     */
	    public static final String TWILIO_ACCOUNT_SID = "your twilio account sid";
	    /*
	     * The Constant AUTH_TOKEN. Find it at twilio.com/user/account
	     */
	    public static final String TWILIO_AUTH_TOKEN = "your twilio account token";
	    // register from number with country code like +1 or +91
	    public static final String TWILIO_FROM_NO = "";
	    /**
	     * TIME ZONE
	     */
	    public static final String TIME_ZONE = "UTC";
	    public static final String APPEND_SECONDS = ":00";
	    public static final String MAIL_HELP_LINK = "If you have questions, we have the answers.<br/>Contact us at ";
	    public static final String UNAUTHORIZED = "Invalid credentials. Please try again.";
	    /**
	     * 
	     */
	    
	    /**
	     * 
	     * @author Darshan Nagesh
	     * Defines the type of View that the user can select to display
	     *
	     */
	    public enum viewType {
		     week,project,task;
		    }
	    public static final String GREENPINE_AUTH = "greenpine";
	    public static final String GOOGLE_AUTH = "google";
	    public static final String CUSTOM_AUTH = "custom";
	    public static final int MINUTES_PER_HOUR = 60;
	    public static final String SUCCESS = "Success";
	    public static final String ADVANCE = "advance";
	    public static final String PAYMENT_UPDATE_FAILED = "Payment update failed";
	    public static final String DATA_ERROR = "Please check the data";
	    public static final String PROCEES_FAILED = "Process failed";
	    public static final String CODE_INVALID = "Shareable Code Is Invalid";
	    public static final String UPDATE_SUCCESS = "Updated successfully.";
	    public static final String UPDATE_FAILED = "Update failed.";
	    public static final String INVALID_PHONE_NUMBER_LENGTH = "Please enter phone number without country code";
	    public static final String INVALID_PHONE_NUMBER = "Please enter correct phone number";
	    public static final String AUTHORIZATION_FAILED = "You Don't have the access.";
	    public static final String BAD_REQUEST = "Bad request";
	    public static final String SOCIAL_LOGIN_PHONE_ERROR = "Phone number is already associated with another email address.";
	    public static final String PROFILE_UPDATE_SUCCESS_MESSAGE = "Your profile was updated successfully.";
	    public static final String CHANGE_PASSWORD_SUCCESS = "Your password was updated successfully.";
	    public static final String EXISTING_TASK_ERROR = "Task already exist for your organisation";
	    public static final String DELETED_USER = "User is already deleted or inactive.";
	    public static final String EXISTING_TEAM_ERROR = "A Team with the same name already exists. Please check";
	    public static final String EXISTING_DESIGNATION_ERROR = "A Desigation with the same name already exists. Please check";
	    public static final int UNAUTHORIZED_ID = 401;
	    public static final int SUCCESS_ID = 200;
	    public static final int PHONE_EXISTS_ID = 300;
	    public static final int EMAIL_EXISTS_ID = 301;
	    public static final int INTERNAL_ERROR_ID = 304;
	    public static final int INVALID_SESSION_ID = 306;
	    public static final int FAILURE_ID = 320;
	    public static final int PAYMENT_FAILURE_ID = 322;
	    public static final int PAYMENT_UPDATE_FAILED_ID = 311;
	    public static final int DATA_ERROR_ID = 312;
	    public static final int BAD_REQUEST_ID = 400;
	    public static final int PROFILE_UPDATE_SUCCESS_MESSAGE_ID = 345;
	    public static final int CHANGE_PASSWORD_ID = 348;
	    public static final int INVALIDPHONENUMBER_ID = 354;
	    public static final int INVALIDPHONENUMBERLENGTH_ID = 355;
	    public static final int PAYMENT_NOT_INTEGRATED = 364;
	    public static final int PAYMENT_INTEGRATED = 365;
	    public static final int PAYMNET_INFO_MISSING = 369;
	    public static final int CARD_INFO_MISSING = 370;
	    public static final int CVN_INFO_MISSING = 371;
	    public static final int EXPIRY_DATE_INFO_MISSING = 372;
	    public static final int ADDRESS_INFO_MISSING = 373;
	    public static final int STATE_INFO_MISSING = 374;
	    public static final int CITY_INFO_MISSING = 375;
	    public static final int ZIP_CODE_INFO_MISSING = 376;
	    public static final int INVALID_URL = 377;
	    public static final int INVALID_REQUEST_FORMAT = 378;
	    public static final int PAYMENT_SUCCESS = 379;
	    public static final int PAYMENT_REQUIRED = 380;
	    public static final int INVALID_EMAIL_FORMAT = 383;
	    public static final int INVALID_CARD_TYPE = 384;
	    public static final int INVALID_CVV_NUMBER = 385;
	    public static final int INVALID_EXPIRY_MONTH = 386;
	    public static final int INVALID_EXPIRY_YEAR = 387;
	    public static final int INVALID_CARD_NUMBER = 389;
	    public static final int INVALID_PAYMENT_DETAILS = 390;
	    public static final int FORGOT_PASSWORD_SUCCESS_ID = 203;
	    
	    public static final String TIME_OUT = "Timed Out";
	    public static final String INVALID_EMAIL_FORMAT_MESSAGE = "Please check email.";
	   
	    public static final String ERROR_DEVELOPER_EMAIL = "";
	    public static final String ERROR_LOG_PM_EMAIL = "";
	    public static final String ERROR_LOG_SUBJECT = "";
	    public static final String USER_SESSION = "userSession";
	    public static final String NO_DATA_FOUND = "No data found";
	    public static final String LINE_NUMBER_NOT_FOUND = "line number not found";
	    public static final String USER_NAME_MISSING = "User name is mandatory.";
	    public static final String TEAM_NAME = "Name Is Mandatory" ;
	    public static final String LOCK_DATE = "Lock Data Mandatory";
	    public static final String CHANNEL = "Channel is Mandatory";
	    public static final String NOTES = "Note is Mandatory";
	    public static final String UNIT = "Unit Id is Mandatory";
	    public static final String PROJECT_CODE = "Project Code is Mandatory ";
	    public static final String UPDATED_ID ="Updating Id is Mandatory";
	    public static final String COUNTRY_ID = "Country Id Required";
	    public static final String PROJECT_ID_MISSING = "Project Id Mandatory";
	    public static final String TASK_ID_MISSING = "Task Id Mandatory";
	    public static final String INVALID_ACTIVITY_REF_NUM = "Invalid activity reference number";
	    public static final String EMAIL_NAME_MISSING = "Email is mandatory.";
	    public static final String DEVICE_TYPE_MISSING = "Oops ! Unable to identify device type.";
	    public static final String DEVICE_ID_MISSING = "Oops ! Unable to identify device id.";
	    public static final String PASSWORD_MISSING = "Password is mandatory.";
	    public static final String PASSWORD_MISMATCH = "New and Confirm passwords don't match.";
	    public static final String PASSWORD_SAME = "New and Old passwords cannot be same.";
	    public static final String NAME_MISSING = " Oops ! First name is mandatory.";
	    public static final String EMP_ID_MISSING = " Oops ! Employee id is missing.";
	    public static final String DESIG_ID_MISSING = " Oops ! Designation id is missing.";
	    public static final String ROLE_ID_MISSING = " Oops ! Role id is missing.";
	    public static final String BU_ID_MISSING = " Oops ! Business id is missing.";
		public static final String ID_MISSING = " Oops ! id is missing.";
		public static final String SC_ID_MISSING = " Oops ! Social contact id is missing.";
		public static final String SC_VAL_MISSING = " Oops ! Social contact value is missing.";
		public static final String USER_ID_MISSING = " Oops ! User id is missing.";
		public static final String EXCEL_EMPTY = "Oops ! Excel sheet is empty or first names are missing for all";
		public static final String COUNTRY_CODE_MISSING = " Oops ! Country Code is missing.";
		public static final String FORGOT_PASSWORD_VM_FILE = "forgot-password.vm";
		public static final String PROJECT_VM_FILE = "project.vm";
	    public static final String PASSWORD_REGENERATED = "Password regenerated";
	    public static final String NEW_PROJECT = "New Project Added";
	    public static final String PHONE_NUMBER_MISSING = "Phone number is mandatory.";
	    public static final String LOCATION_MISSING = "Oops ! Unable to fetch location.";
	    public static final String LONGITUDE_MISSING = "Oops ! Unable to fetch location.";
	    public static final String SESSION_MISSING = "Oops ! Something is wrong with the session. Please log in again.";
	    public static final String INVALID_PHONE_NO = "Please check phone number.";
	    public static final String INVALID_RELATION = "Please check phone number.";
	    public static final String PAYMENT_PROFILE_UPDATE_SUCCESS = "Success! Your payment information has been updated.";
	    public static final String CAPTCHA_VALUE_MISSING = "Oops ! Unable to get captcha value.";
	    public static final String DOB_MISSING = "DOB is mandatory.";
	    public static final String USER_NAME_NA = "Oops ! Username is already taken by anothrer user.";
	    public static final String MAIL = "mail";
	    public static final String SMS = "sms";
	    public static final String DATA_BASE_PARAM_MISSING = "Incorrect number of";
	    public static final String INVALID_URL_MESSAGE = "Please check url";
	    public static final String INVALID_DATA_ENTRY = "Following are invalid entries, please check";
	    public static final String DATE_MISSING = "Date is mandatory.";
	    public static final String NOT_A_CUSTOM_PASSWORD= "Please visit GreenPine for Forgot Password Link";
	    public static final String EMAIL_NOT_VALID = "Please enter valid email id";
	    public static final String DUPLICATE_EMAIL_NUIMBER_IN_EXCEL = "Row Ignored !!! Email Id Duplicated in excel !!!";
	    public static final String DATA_MISSING = "Data Missing";
	    public static final String USER_ALREADY_PRESENT = "User is already present with email provided";
	    public static final String DATE_FORMAT_ERROR = "Date format is wrong";
	    
	    public static final String LOGO_URL ="https://cabhound-static.s3.amazonaws.com/insuranceDoc/claim/tarento_logo.png";
	    public static final String FEEDBACK = "Feedback";
	    
	    public enum days {
		Sunday("sunday", "Sun"), Monday("monday", "Mon"), TuesDay("tuesday",
			"Tue"), Wednesday("wednesday", "Wed"), Thursday("thursday",
			"Thu"), Friday("friday", "Fri"), Saturday("saturday", "Sat");
	    
		private String dayFullName;
		private String dayAbbrevation;

		private days(String dayFullName, String dayAbbrevation) {
		    this.dayFullName = dayFullName;
		    this.dayAbbrevation = dayAbbrevation;
		}

		/**
		 * @return the dayFullName
		 */
		public String getDayFullName() {
		    return dayFullName;
		}

		/**
		 * @param dayFullName
		 *            the dayFullName to set
		 */
		public void setDayFullName(String dayFullName) {
		    this.dayFullName = dayFullName;
		}

		/**
		 * @return the dayAbbrevation
		 */
		public String getDayAbbrevation() {
		    return dayAbbrevation;
		}

		/**
		 * @param dayAbbrevation
		 *            the dayAbbrevation to set
		 */
		public void setDayAbbrevation(String dayAbbrevation) {
		    this.dayAbbrevation = dayAbbrevation;
		}

	    }

	    public enum month {
		January("january", "Jan"), February("February", "Feb"), March("march",
			"Mar"), April("april", "Apr"), May("may", "May"), June("june",
			"June"), July("July", "july"), August("august", "Aug"), September(
			"september", "Sep"), October("October", "Oct"), November(
			"november", "Nov"), December("December", "Dec");
		private String monthFullName;
		private String monthAbbrevation;

		private month(String dayFullName, String dayAbbrevation) {
		    this.monthFullName = dayFullName;
		    this.monthAbbrevation = dayAbbrevation;
		}

		/**
		 * @return the dayFullName
		 */
		public String getDayFullName() {
		    return monthFullName;
		}

		/**
		 * @param dayFullName
		 *            the dayFullName to set
		 */
		public void setDayFullName(String dayFullName) {
		    this.monthFullName = dayFullName;
		}

		/**
		 * @return the dayAbbrevation
		 */
		public String getDayAbbrevation() {
		    return monthAbbrevation;
		}

		/**
		 * @param dayAbbrevation
		 *            the dayAbbrevation to set
		 */
		public void setDayAbbrevation(String dayAbbrevation) {
		    this.monthAbbrevation = dayAbbrevation;
		}
	    }

	    public enum caardType {
		visa,
	    }

	    public static final String ManzarulDeviveId = "";
	    public static final String KannappanDeviveId = "";
	    public static final String JineshDeviveId = "";
	    public static final String DEFAULT_DATE_VALUE = "0000-00-00 00:00:00";
	    public static final String INVALID_CARD_TYPE_MSG = "Please check your card type.";
	    public static final String INVALID_CVV_NUMBER_MSG = "please check the security code.";
	    public static final String INVALID_EXPIRY_MONTH_MSG = "Please check expiration month.";
	    public static final String INVALID_EXPIRY_YEAR_MSG = "Please check expiration year.";
	    public static final String INVALID_CARD_NUMBER_MSG = "Please check your card number.";
	    public static final String BRAIN_TREE_CARD_TYPE_ERROR = "Credit card type is not accepted by this merchant account.";
	    public static final String BRAIN_TREE_CARD_NUMBER_ERROR = "Credit card number is invalid.";
	    public static final String BRAIN_TREE_CVV_NUMBER_ERROR = "Gateway Rejected: cvv";
	    public static final String BRAIN_TREE_MONTH_ERROR = "Expiration month is invalid";
	    public static final String BRAIN_TREE_YEAR_ERROR = "Expiration year is invalid";
	    public static final String BRAIN_TREE_DECLINE = "Declined";
	    public static final String INVALID_PAYMENT_DETAILS_MSG = "Please check payment details";
	    public static final String S3_URL = "S3 image base url";
	    public static final String MAX_TIME = " 23:59:59";
	    public static final String CITY_NAME_MISSING = "Oops ! Unable to identify city.";
	    public static final String MESSAGE_MISSING = "Oops ! Unable to get message.";
	    public static final String UNABLE_TO_GET_PHONE = "Oops ! Unable to get phone number.";
	    public static final String UNABLE_TO_GET_DATE = "Oops ! Unable to get city date.";
	    public static final int ADMIN_ID = 1;

	    public static final int MAX_EXECUTOR_THREAD = 10;

	    /**
	     * These are the status messages coming from twilio after sending sms
	     * 
	     * @author Manzarul.Haque
	     * 
	     */
	    public enum TwilioSMSStatus {
		queued, sending, sent, failed, received, delivered;
	    }
	        public static final String HOST = "smtpout.idc.tarento.com";
	        public static final String FROM = "timetrack@tarento.com";
	        public static final String USER = "AKIAJJLLS652M5B32APA";
	        public static final String PASSWORD = "AhYkENBNOY9M6Cl29IqETcKIWsP5Z+dUNuigVKglCuU5";
	        public static final int ANDROID_GCM_RETRY_COUNT = 5;
	        
	        public enum userRole {
	            superadmin,admin,agent,driver,claimant,lawyer;
	        }
	        public enum userRoleList {
	        	admin,manager,finance,employee,superAdmin,HR
	        }
	        public enum companies { 
	        	tarento
	        }
	        public static final String METHOD_GET ="GET";
	        public enum LoginSource{
	            web,app;
	        }
	        public enum UserType{
	            permanent, contract, intern;
	        }        
	        public static final String USER_NOT_FOUND="No user found with this id.";
	        /**
	         * add developer email. that user will get email in case of error from server.
	         */
	        public static final String [] emails = {"manzarul.haque@tarento.com","Jinesh.Sumedhan@tarento.com"};
	        public static final String ERROR_EMAIL_VM_FILE="error-email.vm";
	        public static final String DATA_ACCESS_ERROR_EMAIL="Data access error mail";
	        public static final String INET_URL="http://inet.idc.tarento.com/user-login-inet-mobile-app";// "http://inet.idc.tarento.com/user-login-analytics-app";
		public static final int CAPACITY = 1024;
		public static final String ELASTIC_URL="http://elasticsearch.idc.tarento.com/kronos-d2/event";
		public static final String GREEN_PINE_URL = "https://greenpine.idc.tarento.com/";
		public static final String MANGER_EMAIL = "Jinesh.Sumedhan@tarento.com";
		public static final String FINANCE_EMAIL ="surendra.babu@tarento.com";
		 public static final String TIME_REPORTING_ALERT="Locked time warning.";
		 public static final String DAILY_TIME_REPORTING_ALERT = "Daily time report not submitted";
		 public static final String WEEKLY_TIME_REPORTING_ALERT = "Weekly time report not submitted";
		public static final String ALIAS = "kronos.support";
		public enum  ELK_OPERATION {
		    save,update,delete;
		}
		
		public static final String ELK_REMINDER_URL = "http://elasticsearch.idc.tarento.com/kronos-reminder-d1/event";
		
		public enum ReminderType {
		    daily,weekly,backDay;
		}
		public enum ReminderSource {
		    scheduler;
		}
		public static final String YESTERDAY_EMAIL_REMINDER_SUBJ = "Yesterday time report not submitted";
		public static final String YESTERDAY_EMAIL_REMINDER_BODY= "You have not reported the minimum 8 hours of tasks for yesterday. Please submit the same ASAP.";
		public static final String PLEASE_PROVIDE_APPLICATION_NAME = "Please provide application name.";
		public static final String INVAILD_RATING = "Please provide a valid rating."; 
		public static final String ELK_FEEDBACK_URL = "http://elasticsearch.idc.tarento.com/feedback-d1/event";
		public static final String IP_COUNTRY_URL = "http://ip-api.com/json/";

		public static final int RESET_CAREER_GAP = 0;

		public static final String EXPENSE_DOCUMENT = "expense_document";
		public static final String COMPLETTED = "completed";
		public static final String REJECTED = "rejected";
		public static final String PENDING = "pending";

		public static final String AWS_S3_BUCKET = "aws.s3.bucket";
	    public static final String AWS_ACCESS_KEY = "aws.access.key";
	    public static final String AWS_SECRET_KEY = "aws.secret.key";
	    public static final List<String> GENDER_DATA = new ArrayList<String>(Arrays.asList("Male", "Female"));
	    public static final List<String> BLOOD_GROUP = new ArrayList<String>(Arrays.asList("A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"));
	    public static final List<String> USER_TYPE = new ArrayList<String>(Arrays.asList("permanant", "contract", "intern"));
	    public static final Map<String, Long> USER_TYPE_MAP = new HashMap<String, Long>(){{put("permanant", 1l); put("contract", 2l); put("intern", 3l);}};

	    public static final int LEAVE_PROJECT_ID = 782;
	    
	    public static final String HASH_SYMBOL = "#";

	}


