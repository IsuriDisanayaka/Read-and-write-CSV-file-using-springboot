package lk.wixis.springboot.message;

/**
 * @author Isuri Disanayaka <isuriumeshika1@gmail.com>
 * @since 03/12/2021
 **/

    public class ResponseMessage {
        private String message;

        public ResponseMessage(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

