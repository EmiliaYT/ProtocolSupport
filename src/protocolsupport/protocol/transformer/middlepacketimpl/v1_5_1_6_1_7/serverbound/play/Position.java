package protocolsupport.protocol.transformer.middlepacketimpl.v1_5_1_6_1_7.serverbound.play;

import protocolsupport.protocol.PacketDataSerializer;
import protocolsupport.protocol.transformer.middlepacket.serverbound.play.MiddlePosition;

public class Position extends MiddlePosition {

	@Override
	public void readFromClientData(PacketDataSerializer serializer) {
		x = serializer.readDouble();
		y = serializer.readDouble();
		serializer.readDouble();
		z = serializer.readDouble();
		onGround = serializer.readBoolean();
	}

}