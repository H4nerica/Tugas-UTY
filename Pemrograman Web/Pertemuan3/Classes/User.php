<?php
include_once '../Config/Database.php';

class User{
    private $db;
    public function __construct(){
        $this->db = (new Database())->conn;
    }
    public function getAllUsers(){
        $sql = "select * from users";
        return $this->db->query($sql);
    }
}
?>