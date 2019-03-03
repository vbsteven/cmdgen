#!/usr/bin/env ruby

require 'json'


# this is where you add your code,
# the method will be called with line containing the full line string
# and idx containing the line number (starting at 0)

def do_with_line(line, idx)

  # your code goes here

end



# the loop, you should not be editing this
idx = 0
line = ARGF.gets
until ARGF.eof?
  do_with_line(line, idx)
  idx+=1
  line = ARGF.gets
end



