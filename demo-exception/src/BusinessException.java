public class BusinessException extends Exception{
  private int code;

  private BusinessException(Syscode syscode){ // only way to create
    super(syscode.getDesc());
    this.code=syscode.getCode();
  }

  public static BusinessException of(Syscode syscode){
    if(syscode == null){
      throw new IllegalArgumentException();
    }
    return new BusinessException(syscode);
  }

  public static void main(String[] args) throws Exception {
    Exception e = new Exception("Login Fail:");
    BusinessException be = BusinessException.of(Syscode.LOGIN_FAIL);
    throw be;
  }
}
