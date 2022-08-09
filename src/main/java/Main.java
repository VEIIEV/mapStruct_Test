public class Main {

    public static void main(String[] args) {
        AuthorMapper mapper = new AuthorMapperImpl();

        AuthorDto dto = new AuthorDto();
        dto.setFirstName("Stephen");
        dto.setLastName("King");
        dto.setBiography("An American author of horror");

        Author entity = mapper.dtoToEntity(dto);

        System.out.println(entity.toString());
    }
}
