-- PG_BLOCK_START
begin
  insert into test(id,test) values(-3, 'RAW test');
  insert into test(id,test) values(-4, 'RAW test 2');
  insert into test(id,test) values(-5, 'RAW test 3');
end;
-- PG_BLOCK_END
