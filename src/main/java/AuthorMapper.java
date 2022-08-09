import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface AuthorMapper {

    @Mappings({
            @Mapping(target = "firstName", source = "entity.authorFirstName"),
            @Mapping(target = "lastName", source = "entity.authorLastName"),
            @Mapping(target = "biography",  source = "entity.authorBiography")
    })
    AuthorDto entityToDto(Author entity);

    @Mappings({
            @Mapping(target = "authorFirstName", source = "dto.firstName"),
            @Mapping(target = "authorLastName", source = "dto.lastName"),
            @Mapping(target = "authorBiography",  source = "dto.biography")
    })
    Author dtoToEntity(AuthorDto dto);

}