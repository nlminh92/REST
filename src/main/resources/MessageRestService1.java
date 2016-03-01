@Path("/message")
public class MessageRestService1 {
	@GET
	@Path("/helloWorl")
	public Response helloWorl() {
		String result = "Hello Worl";
		return Response.status(200).entity(result).build();

}
