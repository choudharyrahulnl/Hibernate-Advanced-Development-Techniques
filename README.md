# Hibernate-Advanced-Development-Techniques

<h3>Hibernate Types: </h3>
<ul>
    <li>Entity Type</li>
    <li>Value Types</li>
</ul>

<h3>Entity Types: </h3>
<ul>
    <li>Entity Type: Customer, Student, Account ...</li>
    <li>Have their own lifecycle (detach, persist, removed, refresh) and unique identifier (id)</li>
</ul>

<h3>Value Types: </h3>
<ul>
    <li>Value Types: String, Integer, Double, Date...</li>
    <li>Do not have their own lifecycle and no identifier</li>
</ul>

<h3>Value Category: </h3>
<ul>
    <li>Basic: String, Integer, Double, Date...</li>
    <li>Embedded: Customer, Student, Account ...</li>
    <li>Collection: List, Set, Map ... we used like @ElementCollection</li>
</ul>

<h3>Embedded: Student & Address</h3>
<ul>
    <li>@Embeddable: Apply to Address Class</li>
    <li>@Embedded: Apply on Student Class and its optional</li>
    <li>Since it's a value type so no @Id will be used</li>
    <li>We can have a database table Student which contains address but in java we can create separate Class for Student & Address</li>
</ul>

