/**
 * 
 */
package service;

import po.Jreceive;

/**
 * @author Administrator
 *
 */
public interface JreceiveService {
/*验证是否已经参加了*/
	public   int   IsTakePartIn(Jreceive jreceive);
	/*参加交游条目*/
	public   int   TakePartIn(Jreceive jreceive);
}
