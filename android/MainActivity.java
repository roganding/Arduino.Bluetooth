/*
	author:rogan
*/

/*
 * Android communicate with arduino over bluetooth
 */
package mars.bluetootharduino;

import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private BluetoothAdapter mBluetoothAdapter;
	private BluetoothSocket btSocket;
	private OutputStream outputStream;
	private static final UUID MY_UUID = UUID
			.fromString("00001101-0000-1000-8000-00805F9B34FB");
	private static String ADDRESS = ("20:13:08:28:11:59");

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

		BluetoothDevice device = mBluetoothAdapter.getRemoteDevice(ADDRESS);

		try {
			btSocket = device
					.createInsecureRfcommSocketToServiceRecord(MY_UUID);
		} catch (Exception e) {
			e.printStackTrace();
		}

		mBluetoothAdapter.cancelDiscovery();

		try {
			btSocket.connect();
		} catch (Exception e) {

			try {
				btSocket.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

		Button mButtonF = (Button) findViewById(R.id.buttonF);
		mButtonF.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String message;
				byte[] msgBuffer;
				try {
					outputStream = btSocket.getOutputStream();
					message = "1";
					msgBuffer = message.getBytes();
					try {
						outputStream.write(msgBuffer);
					} catch (Exception e) {
					}
				} catch (Exception e) {
				}

			}
		});

		Button mButtonB = (Button) findViewById(R.id.buttonB);
		mButtonB.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String message;
				byte[] msgBuffer;
				try {
					outputStream = btSocket.getOutputStream();
					message = "2";
					msgBuffer = message.getBytes();
					try {
						outputStream.write(msgBuffer);
					} catch (Exception e) {
					}
				} catch (Exception e) {
				}

			}
		});

		Button mButtonL = (Button) findViewById(R.id.buttonL);
		mButtonL.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String message;
				byte[] msgBuffer;
				try {
					outputStream = btSocket.getOutputStream();
					message = "3";
					msgBuffer = message.getBytes();
					try {
						outputStream.write(msgBuffer);
					} catch (Exception e) {
					}
				} catch (Exception e) {
				}

			}
		});

		Button mButtonR = (Button) findViewById(R.id.buttonR);
		mButtonR.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String message;
				byte[] msgBuffer;
				try {
					outputStream = btSocket.getOutputStream();
					message = "4";
					msgBuffer = message.getBytes();
					try {
						outputStream.write(msgBuffer);
					} catch (Exception e) {
					}
				} catch (Exception e) {
				}

			}
		});

		Button mButtonS = (Button) findViewById(R.id.buttonS);
		mButtonS.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String message;
				byte[] msgBuffer;
				try {
					outputStream = btSocket.getOutputStream();
					message = "0";
					msgBuffer = message.getBytes();
					try {
						outputStream.write(msgBuffer);
					} catch (Exception e) {
					}
				} catch (Exception e) {
				}

			}
		});
	}

}
